package teammates.common.util;

import com.google.appengine.api.blobstore.BlobKey;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jasper on 14-Jun-17.
 */
public class GoogleCloudStorageHelperServiceStub extends GoogleCloudStorageHelperService {
    private static final int MAX_READING_LENGTH = 900000;
    private static final Logger log = Logger.getLogger();

    public static boolean doesFileExistInGcs(BlobKey fileKey) {
        return false;
    }

    public static void deleteFile(BlobKey fileKey) {
        //do stuff
    }

    public static String writeImageDataToGcs(String googleId, byte[] imageData) throws IOException {
        return "Written data to Gcs";
    }

    public static String getNewUploadUrl(String callbackUrl) {
        return "newUrl.com";
    }

    public static List<List<String>> getGroupReceiverList(BlobKey blobKey) throws IOException {
        return new ArrayList<>();
    }

    private static long getFileSize(BlobKey blobKey) {
        return 1000L;
    }
}
