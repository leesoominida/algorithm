import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


class Meeting{
	int start, end;

	public Meeting(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meeting [start=");
		builder.append(start);
		builder.append(", end=");
		builder.append(end);
		builder.append("]");
		return builder.toString();
	}	
}



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Meeting> meetings = new ArrayList<>();
		int start = 0;
		int end = 0;
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			meetings.add(new Meeting(start, end));
		}
		Collections.sort(meetings, (m1, m2) -> m1.end != m2.end ? m1.end - m2.end : m1.start - m2.start);
		ArrayList<Meeting> result = new ArrayList<> ();
		result.add(meetings.get(0));
		
		for(int i = 1; i < N; i++) {
			if(result.get(result.size() -1).end <= meetings.get(i).start) {
				result.add(meetings.get(i));
			}
		}
		//System.out.println(meetings.toString());
		System.out.println(result.size());
	}

}