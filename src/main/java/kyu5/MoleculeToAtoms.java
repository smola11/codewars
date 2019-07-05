package kyu5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MoleculeToAtoms {

    private static Iterator<String> tokenIterator;
    private static Stack<Integer> bracketStack;

    private static final String  AT_NUM    = "[A-Z][a-z]?\\d*";
    private static final String  OPEN_BRA  = "[{(\\[]";
    private static final String  CLOSE_BRA = "[)}\\]]\\d*";
    private static final Pattern TOKENIZER = Pattern.compile(String.format("%s|%s|%s", AT_NUM, OPEN_BRA, CLOSE_BRA));
    private static final Pattern P_AT_NUM  = Pattern.compile("(?<at>[A-Z][a-z]*)(?<num>\\d*)");


    public static Map<String,Integer> getAtoms(String formula) {

        List<String> tokens = new ArrayList<>();
        Matcher m = TOKENIZER.matcher(formula);
        while (m.find()) tokens.add(m.group());

        if (!String.join("", tokens).equals(formula)) throw new IllegalArgumentException("Invalid formula");

        bracketStack = new Stack<>();
        tokenIterator = tokens.iterator();

        RawForm ans = getRawFormula();
        if (!bracketStack.empty()) throw new IllegalArgumentException("Invalid formula");

        return ans;
    }


    private static RawForm getRawFormula() {

        RawForm raw = new RawForm();

        while (tokenIterator.hasNext()) {
            String tok = tokenIterator.next();

            if (tok.matches(OPEN_BRA)) {
                bracketStack.push((int) tok.charAt(0));
                raw.concatWith(getRawFormula());

            } else if (tok.matches(AT_NUM)) {
                Matcher m = P_AT_NUM.matcher(tok);
                m.find();
                raw.addAtom(m.group("at"), m.group("num").isEmpty() ? 1 : Integer.parseInt(m.group("num")));

            } else if (tok.matches(CLOSE_BRA)) {
                if (bracketStack.empty() || (bracketStack.peek()+1 != (int) tok.charAt(0) && bracketStack.peek()+2 != (int) tok.charAt(0)))
                    throw new IllegalArgumentException("Invalid formula");
                bracketStack.pop();

                if (tok.length() > 1) raw.mulBy(Integer.parseInt(tok.substring(1)));
                break;
            }
        }
        return raw;
    }

    static class RawForm extends HashMap<String,Integer> {
        public RawForm() { super(); }

        public void addAtom(final String atom, final int n) { this.put(atom, n + this.getOrDefault(atom, 0)); }
        public RawForm mulBy(final int n)                   { this.forEach(  (at,v) -> this.put(at, v*n) ); return this; }
        public RawForm concatWith(RawForm other)            { other.forEach( (at,v) -> this.put(at, v + this.getOrDefault(at, 0))  ); return this; }
    }


}
