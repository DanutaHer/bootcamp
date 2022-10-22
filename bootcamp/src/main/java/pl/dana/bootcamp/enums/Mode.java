package pl.dana.bootcamp.enums;

public enum Mode {
	DAILY("Dzienny"),
	WEEKEND("Weekendowy"),
	EVENING("Wieczorowy");
	
	public final String label;

    private Mode(String label) {
        this.label = label;
    }
}
