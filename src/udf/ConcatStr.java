package udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class ConcatStr extends UDF {
	public String evaluate(String input1, String[] input2){
		String output = "";
		if (input1==null && input2==null){
			return null;			
		}
		for(int i = 0; i < input2.length; i++){
			output+= input2[i];
		}
		return(input1.concat(output));
	}

}
