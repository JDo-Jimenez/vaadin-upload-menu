package com.example.myapplication;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.vaadin.server.Extension;
import com.vaadin.server.FileDownloader;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Upload.Receiver;

public class CustomUploader extends HorizontalLayout {
	private static final long serialVersionUID = -8597656423721334862L;

	CustomReceiver receiver;
	Upload upload;


	public CustomUploader() {
		super();


		receiver = new CustomReceiver();

		upload = new Upload(null, receiver);
		upload.setImmediateMode(true);
		upload.setButtonCaption("Upload File");

		upload.addSucceededListener(event -> {
			final StreamSource streamSource = () -> {
				if (receiver.getBaos() != null) {
					final byte[] byteArray = receiver.getBaos().toByteArray();
					return new ByteArrayInputStream(byteArray);
				}
				return null;
			};
			FileDownloader fileDownloader = null;
			final StreamResource resource = new StreamResource(streamSource, event.getFilename());
			resource.setMIMEType(event.getMIMEType());

			fileDownloader = new FileDownloader(resource);



			upload.setButtonCaption(receiver.filename);


		});

		addComponents(upload);
	}

}

class CustomReceiver implements Receiver {
	private static final long serialVersionUID = -355650363137947012L;
	ByteArrayOutputStream baos;
	String filename;
	String MIMEType;

	/**
	 * return an OutputStream that simply counts lineends
	 */
	@Override
	public OutputStream receiveUpload(final String filename, final String MIMEType) {
		baos = new ByteArrayOutputStream();
		this.filename = filename;
		this.MIMEType = MIMEType;

		OutputStream os = new OutputStream() {

			@Override
			public void write(final int b) {
				baos.write(b);
			}
		};

		return os;
	}

	ByteArrayOutputStream getBaos() {
		return baos;
	}
}