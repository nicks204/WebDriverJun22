package aws;

import java.util.List;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class SDKExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AWSCredentials credentials = new BasicAWSCredentials("AKIA26UGQ5DCNXBM5INB","6w5bg69lwMr1gUU8BErfKkXzhcN8InKO5/Bqnz6Q");
		
		AmazonS3 s3client = AmazonS3ClientBuilder
				  .standard()
				  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				  .withRegion(Regions.US_EAST_1)
				  .build();
		
		// List all the buckets
		List<Bucket> allBuckets = s3client.listBuckets();
		for(Bucket bucket : allBuckets) {
		    System.out.println(bucket.getName());
		}
		
		// Create New Bucket
		String bucketName = "nik204.it.bucket";
		if(s3client.doesBucketExistV2(bucketName)) { 
			System.out.println("Bucket already exist");
		}else {
			s3client.createBucket(bucketName);
			System.out.println("Bucket created");
		}
		
		//List the objects
		ObjectListing objectListing = s3client.listObjects(bucketName);
		for(S3ObjectSummary os : objectListing.getObjectSummaries()) {
		    System.out.println(os.getKey());
		}
	}

}
