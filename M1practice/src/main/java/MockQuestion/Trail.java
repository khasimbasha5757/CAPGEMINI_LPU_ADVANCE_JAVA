package MockQuestion;

public class Trail {
private String trailid;
private String name;
private String region;
private String difficulty;
private int hikeCount;
Trail(){
	
}
Trail(String trailid,String name,String region,String difficulty,int hikeCount){
	this.trailid=trailid;
	this.name=name;
	this.region=region;
	this.difficulty=difficulty;
	this.hikeCount=hikeCount;
}
public String getTrailid() {
	return trailid;
}
public void setTrailid(String trailid) {
	this.trailid = trailid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getDifficulty() {
	return difficulty;
}
public void setDifficulty(String difficulty) {
	this.difficulty = difficulty;
}
public int getHikeCount() {
	return hikeCount;
}
public void setHikeCount(int hikeCount) {
	this.hikeCount = hikeCount;
}
public String toString() {
	return trailid+"|"+name+"|"+region+"|"+difficulty+"|"+hikeCount;
}
}
