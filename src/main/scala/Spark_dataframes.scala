import org.apache.spark.sql.SparkSession


object Spark_dataframes extends App {

  val spark = SparkSession.builder()
    .appName("My Spark_dataframe_app_1")
    .master("local[2]")
    .getOrCreate()





  spark.stop()



}
