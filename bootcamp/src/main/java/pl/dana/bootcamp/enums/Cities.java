package pl.dana.bootcamp.enums;

public enum Cities {
	WARSZAWA("Warszawa"),
	SZCZECIN("Szczecin"),
	GDANSK("Gdańsk");
	
	public final String label;

    private Cities(String label) {
        this.label = label;
    }

    private String citiesNames() {
    	return label;
    }
}
