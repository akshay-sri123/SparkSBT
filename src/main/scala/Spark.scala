import org.apache.spark.sql.SparkSession

class Trial
{

  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()

  import spark.implicits._

  val df = spark.read.json("C:\\Users\\Akshay\\Documents\\people.json")

  df.show()
}

