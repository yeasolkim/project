package swssm.fg.bi_box.model;

public class Feature {
	String type = "";
	Geometry geometry;
	Property properties;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public Property getProperties() {
		return properties;
	}
	public void setProperties(Property properties) {
		this.properties = properties;
	}
	
	
}
