package prtc;

public class IdRecommend {

	public static void main(String[] args) {
		String new_id="...!@BaT#*..y.abcdefghijklm";
		String match2 = "[^a-z0-9-_.]";
		String match3 = "[.]{2,}";
		String match4 = "^[.]";
		String match4_1 = "[.]$";
		System.out.println(new_id);
		new_id = new_id.toLowerCase();
		System.out.println(new_id);
		new_id = new_id.replaceAll(match2, "");
		System.out.println(new_id);
		new_id = new_id.replaceAll(match3, ".");
		System.out.println(new_id);
		new_id = new_id.replaceAll(match4, "");
		System.out.println(new_id);
		if(new_id.equals("")) new_id="a";
		new_id = new_id.substring(0, 15);
		System.out.println(new_id);
		new_id = new_id.replaceAll(match4_1, "");
		System.out.println(new_id);
		if(new_id.length()<=2) {
			while(new_id.length()>=3) {
				//주석 처리 된건 내가 처음한것 (시간초과 걸림)
				//new_id.concat(Character.toString(new_id.charAt(new_id.length()-1)));
				new_id += new_id.substring(new_id.length()-1);
			}
		}
		System.out.println(new_id);
	}

}
