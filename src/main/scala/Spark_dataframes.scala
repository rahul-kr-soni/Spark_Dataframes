import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


object Spark_dataframes extends App {

  val sparkConf = new SparkConf()
  sparkConf.set("spark.app.name","My first Spark_Dataframe")
  sparkConf.set("spark.master","local[2]")

  val spark = SparkSession.builder()
    //.appName("My Spark_dataframe_app_1")
    //.master("local[2]")
    .config(sparkConf)
    .getOrCreate()

print("rahul")



  spark.stop()



}
