import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends
		Reducer<DoubleWritable, Text, DoubleWritable, Text> {
	String tempPath="";
	@Override
	protected void reduce(DoubleWritable key, Iterable<Text> values,
			Context context) throws IOException, InterruptedException {
		tempPath="";
		for(Text value:values){
			tempPath = value.toString();
		}
		context.write(key, new Text(tempPath));
	}
}
