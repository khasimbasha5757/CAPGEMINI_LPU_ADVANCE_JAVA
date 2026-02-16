package MockQuestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TrailUtil {
private List<Trail> trailList=new ArrayList<>();
	public List<Trail> getTrailList() {
	return trailList;
}
public void setTrailList(List<Trail> trailList) {
	this.trailList = trailList;
}
	public void addTrail(String trailid,String name,String region,String difficulty,int hikeCount) {
		trailList.add(new Trail(trailid,name,region,difficulty,hikeCount));
	}
	public void display() {
		Iterator<Trail> t=trailList.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}
	public void displayById(String id) {
		Iterator<Trail> s=trailList.iterator();
		while(s.hasNext()) {
			if(s.next().getTrailid()==id) {
				System.out.println(s.next());
			}
		}
	}
	public static void main(String[] args) {
		TrailUtil tr=new TrailUtil();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of trails to be added");
		int n=s.nextInt();
		System.out.println("Enter trail details");
		for(int i=1;i<=n;i++) {
			String trailid=s.next();
			String name=s.next();
			String region=s.next();
			String difficulty=s.next();
			int hikeCount=s.nextInt();
			tr.addTrail(trailid,name,region,difficulty,hikeCount);
		}
		
		System.out.println("Enter the Trail Id to check hike status");
		String idCheck=s.next();
		tr.displayById("101");
//		tr.display();
		
	}
}
