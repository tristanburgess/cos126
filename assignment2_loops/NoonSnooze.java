package assignment2_loops;

public class NoonSnooze {
    static final int MINUTES_PER_HOUR = 60;
    static final int HOURS_IN_CLOCK = 24;
    static final int HOURS_IN_CLOCK_SPLIT = 12;
    static final int MINUTES_PER_SPLIT_PERIOD = MINUTES_PER_HOUR * HOURS_IN_CLOCK_SPLIT;

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        int snooze = Integer.parseInt(args[0]);

        int hoursAfterStart = (snooze + MINUTES_PER_SPLIT_PERIOD) / MINUTES_PER_HOUR;
        int hour = hoursAfterStart % HOURS_IN_CLOCK;
        // NOTE(tristan): adjusts so that hour 0 is displayed as 12.
        int hourDisplay = (hour + HOURS_IN_CLOCK_SPLIT - 1) % HOURS_IN_CLOCK_SPLIT + 1;
        // NOTE(tristan): handles negative values of snooze
        int minute = ((snooze % MINUTES_PER_HOUR) + MINUTES_PER_HOUR) % MINUTES_PER_HOUR;
        boolean ampm = hour < HOURS_IN_CLOCK_SPLIT;
        System.out.printf("%d:%02d%s\n", hourDisplay, minute, ampm ? "am" : "pm");
    }
}
