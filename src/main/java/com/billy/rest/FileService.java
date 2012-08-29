package com.billy.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
//import org.apache.commons.io.IOUtils;

 
@Path("/file")
public class FileService {
 
	private static final String FILE_PATH = "E:\\data\\downloads\\poem.txt";
 
	@GET
	@Path("/get")
	@Produces("text/plain")
	public Response getFile() {
 
		File file = new File(FILE_PATH);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=\"Saying Goodbye to Cambridge Again\"");
		return response.build();
 
	}
	
//	private final String UPLOADED_FILE_PATH = "d:\\";
//	 
//	@POST
//	@Path("/upload")
//	@Consumes("multipart/form-data")
//	public Response uploadFile(MultipartFormDataInput input) {
// 
//		String fileName = "";
// 
//		Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
//		List<InputPart> inputParts = uploadForm.get("uploadedFile");
// 
//		for (InputPart inputPart : inputParts) {
// 
//		 try {
// 
//			MultivaluedMap<String, String> header = inputPart.getHeaders();
//			fileName = getFileName(header);
// 
//			//convert the uploaded file to inputstream
//			InputStream inputStream = inputPart.getBody(InputStream.class,null);
// 
//			byte [] bytes = IOUtils.toByteArray(inputStream);
// 
//			//constructs upload file path
//			fileName = UPLOADED_FILE_PATH + fileName;
// 
//			writeFile(bytes,fileName);
// 
//			System.out.println("Done");
// 
//		  } catch (IOException e) {
//			e.printStackTrace();
//		  }
// 
//		}
// 
//		return Response.status(200)
//		    .entity("uploadFile is called, Uploaded file name : " + fileName).build();
// 
//	}
// 
//	/**
//	 * header sample
//	 * {
//	 * 	Content-Type=[image/png], 
//	 * 	Content-Disposition=[form-data; name="file"; filename="filename.extension"]
//	 * }
//	 **/
//	//get uploaded filename, is there a easy way in RESTEasy?
//	private String getFileName(MultivaluedMap<String, String> header) {
// 
//		String[] contentDisposition = header.getFirst("Content-Disposition").split(";");
// 
//		for (String filename : contentDisposition) {
//			if ((filename.trim().startsWith("filename"))) {
// 
//				String[] name = filename.split("=");
// 
//				String finalFileName = name[1].trim().replaceAll("\"", "");
//				return finalFileName;
//			}
//		}
//		return "unknown";
//	}
// 
//	//save to somewhere
//	private void writeFile(byte[] content, String filename) throws IOException {
// 
//		File file = new File(filename);
// 
//		if (!file.exists()) {
//			file.createNewFile();
//		}
// 
//		FileOutputStream fop = new FileOutputStream(file);
// 
//		fop.write(content);
//		fop.flush();
//		fop.close();
// 
//	}
 
}