package model.objects;

public class Resource {
	public int resourceType;
	public String path;
	
	public Resource(int resourceType, String path) {
		this.resourceType = resourceType;
		this.path = path;
	}

	public int getResourceType() {
		return resourceType;
	}

	public void setResourceType(int resourceType) {
		this.resourceType = resourceType;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}		
	
	public boolean equals(Object resource) {
		//TODO
		return false;
	}	
}
