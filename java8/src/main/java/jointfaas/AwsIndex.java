package jointfaas;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AwsIndex implements RequestStreamHandler {
    private Index handler = new Index();
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        handler.handle(inputStream, outputStream);
    }
}