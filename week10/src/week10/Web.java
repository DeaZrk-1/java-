package week10;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "<html><head><title>��ӭ�����人��֯��ѧ��ҳ</title></head>"
				+ "\n<body><img src='1.jpg'/>"
				+"\n<a href='1.htm'>��ҳ</a>"
				+ "\n<a href='2.htm'>����</a>"
				+ "\\n<a href='3.htm'>����ѧԺ</a>"
				+ "\n<img src='2.jpg'/>"
				+ "\n<img src='3.jpg'/>"
				+ "\n</body></html>";
		ArrayList<String> srcList = new ArrayList<String>();
		ArrayList<Link> aList = new ArrayList<Link>();
		Pattern title = Pattern.compile("(<title>)(.*?)(</title>)",Pattern.CASE_INSENSITIVE);
		Matcher tmatcher = title.matcher(content);
		System.out.print("��ҳ���⣺");
		while(tmatcher.find()) {
			System.out.println(tmatcher.group(2));
		}
		Pattern p = Pattern.compile("<(img)(.*?)(>|></img>|/>)",Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(content);
		boolean hasPic = matcher.find();
		int picNum = 0;
		int aNum = 0;
		if(hasPic == true) {
			while(hasPic) {
				String group = matcher.group(2);
				//System.out.println(group);
				Pattern srcText = Pattern.compile("(src)=(\"|\')(.*?)(\"|\')",Pattern.CASE_INSENSITIVE);
				Matcher matcher2 = srcText.matcher(group);
				if(matcher2.find()) {
					srcList.add(matcher2.group(3));
					picNum++;
				}
				hasPic = matcher.find();
			}
		}
		System.out.print("��ҳ�й�����"+picNum+"��ͼƬ,�ļ���Ϊ��");
		for(String pic:srcList) {
			System.out.print(pic+",");
		}
		System.out.println();
		Pattern a = Pattern.compile("<(a)(.*?)>(.*?)(</a>)",Pattern.CASE_INSENSITIVE);
		Matcher amatcher = a.matcher(content);
		boolean hasa = amatcher.find();
		if(hasa == true) {
			while(hasa) {
				String group = amatcher.group(2)+amatcher.group(3);
				Pattern aText = Pattern.compile("(href)=(\"|\')(.*?)(\"|\')(.*)",Pattern.CASE_INSENSITIVE);
				Matcher matcher2 = aText.matcher(group);
				if(matcher2.find()) {
					Link info = new Link(matcher2.group(5),matcher2.group(3));
					aList.add(info);
					aNum++;
				}
				hasa = amatcher.find();
			}
		}
		System.out.println("��ҳ�а���"+aNum+"�������ӣ���������Ϣ����:");
		System.out.println("����\t��ַ\t");
		for(Link hy:aList) {
			System.out.println(hy.toString());
		}
	}

}