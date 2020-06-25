package kyu4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanReadableDurationFormatTest {

    @Test
    public void shouldReturnOneSecond() {
        assertEquals("1 second", HumanReadableDurationFormat.formatDuration(1));
    }

    @Test
    public void shouldReturnMinuteAndSecond() {
        assertEquals("1 minute and 2 seconds", HumanReadableDurationFormat.formatDuration(62));
    }

    @Test
    public void ShouldReturnTwoMinutes() {
        assertEquals("2 minutes", HumanReadableDurationFormat.formatDuration(120));
    }

    @Test
    public void shouldReturnOneHour() {
        assertEquals("1 hour", HumanReadableDurationFormat.formatDuration(3600));
    }

    @Test
    public void ShouldReturnHourMinuteSecond() {
        assertEquals("1 hour, 1 minute and 2 seconds", HumanReadableDurationFormat.formatDuration(3662));
    }
}