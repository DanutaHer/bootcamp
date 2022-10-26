package pl.dana.bootcamp.enums;

public enum TypMod {
	DAILY("Dzienny"),
	WEEKEND("Weekendowy"),
	EVENING("Wieczorowy");
	
	public final String label;

    private TypMod(String label) {
        this.label = label;
    }
    
    public String getMode() {
        return label;
    }
}
