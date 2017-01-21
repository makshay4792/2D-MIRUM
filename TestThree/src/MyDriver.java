import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class MyDriver extends Configured implements Tool {
	public static String PATH = "";

	public int run(String[] arg) throws Exception {
		Job job = new Job(getConf());
		job.setJarByClass(getClass());
		FileInputFormat.setInputPaths(job, new Path(arg[0])); 
		FileOutputFormat.setOutputPath(job, new Path(arg[1]));
		
		
		//FileInputFormat.setInputPaths(job, new Path(arg[0])); 
		//FileOutputFormat.setOutputPath(job, new Path(arg[1]));
		
		
		job.setMapperClass(MyMapper.class);
		job.setReducerClass(MyReducer.class);
		// job.setNumReduceTasks(3);
		// job.setCombinerClass(MyReducer.class);
		job.setOutputKeyClass(DoubleWritable.class);
		job.setOutputValueClass(Text.class);
		job.setMapOutputKeyClass(DoubleWritable.class);
		job.setMapOutputValueClass(Text.class);
		return job.waitForCompletion(true) ? 0 : 1;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("1");
		PATH = getInput();
		System.out.println(">>>>>>>>>>>>>"+PATH);
		int exitCode = ToolRunner.run(new MyDriver(), args);
		System.out.println("11");
		System.out.println(exitCode);
	}

	public static String getInput() throws IOException {
		File file = new File("/home/akshay/Desktop/dumpInput");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String path =br.readLine();
		System.out.println("PATH---------->"+path);
		//String path="/home/hduser/Desktop/ProjectDataVIMP/TumorImages/12.gif";
		br.close();
		//file.delete();
		return path;
	}

}
