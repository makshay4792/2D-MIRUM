import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text, DoubleWritable, Text> {
	private String VECTOR_IN = "";
	String vect[]=new String[16];;
	int sum[] = new int[16];
	double total = 0;
	String tempVect = null, tempPath = null,tempDis=null,temptreatment=null;
	double t = 0;

	public MyMapper() {
		try {
			File file = new File("/home/akshay/Desktop/dumpInput");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String path =br.readLine();
			
			VECTOR_IN = path;
			//VECTOR_IN="41439$38945 1680$4227 1087$3790 1443$3121 3985$2460 4679$2060 3410$1682 2389$1476 1495$1177 1199$1054 911$913 624$707 512$643 510$448 172$362 1$1451";
			System.out.println("***************"+VECTOR_IN);
			vect = VECTOR_IN.split(" ");
			System.out.println("Vector Length:::::::"+vect.length);
			for(String v:vect){
				System.out.println(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double getEuclideanDistance(int x1, int y1, int index) {
		double dist = 0;
		int x2, y2;

		StringTokenizer subSplits = new StringTokenizer(vect[index], "$");
		x2 = Integer.parseInt(subSplits.nextToken());
		y2 = Integer.parseInt(subSplits.nextToken());

		int x, y;
		x = x1 - x2;
		y = y1 - y2;
		x = x * x;
		y = y * y;
		dist = Math.sqrt(x + y);
		return dist;
	}

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		total = 0;
		String input = value.toString();
		StringTokenizer tokenizer = new StringTokenizer(input,"\t");
		tempVect = tokenizer.nextToken();
		tempDis=tokenizer.nextToken();
		temptreatment=tokenizer.nextToken();
		tempPath = tokenizer.nextToken();

		String[] splits = tempVect.split(" ");
		int t1, t2;
		int x, y;
		StringTokenizer subSplits=null;
		for (int i = 0; i < 16; i++) {
			subSplits = new StringTokenizer(splits[i], "$");
			x = Integer.parseInt(subSplits.nextToken());
			y = Integer.parseInt(subSplits.nextToken());
			t = getEuclideanDistance(x, y, i);
			total = total + t;
		}
		System.out.println("T==========" + total);
		context.write(new DoubleWritable(total), new Text(tempDis+" "+temptreatment+" "+tempPath));
	}

}
