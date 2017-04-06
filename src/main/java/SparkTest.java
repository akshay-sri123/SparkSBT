
import org.apache.spark.sql.AnalysisException;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class SparkTest {
	
	public static void main(String[] args)throws AnalysisException {
		SparkSession sparkSession = SparkSession.builder().appName("Java spark basic example").config("spark.master", "local").getOrCreate();
		
		runBasicDataFrameExample(sparkSession);
		sparkSession.stop();
	}
	
	private static void runBasicDataFrameExample(SparkSession sparkSession) throws AnalysisException
	{
		Dataset<Row> df = sparkSession.read().json("C:\\Users\\Akshay\\Documents\\people.json");
		df.show();
		df.printSchema();
	}
	
}
