package pl.dana.bootcamp.enums;

public enum Cities {
	WARSZAWA("Warszawa"),
	SZCZECIN("Szczecin"),
	GDANSK("Gdańsk");
	
	public final String label;

    private Cities(String label) {
        this.label = label;
    }
    
    public String getCity() {
        return label;
    }
}
