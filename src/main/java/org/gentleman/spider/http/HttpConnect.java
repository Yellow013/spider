package org.gentleman.spider.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpConnect {

	public static void main(String[] args) {

		HttpConnect httpConnect = new HttpConnect();
		httpConnect.httpGet("http://chengye.blog.163.com/blog", "GBK");

	}

	CloseableHttpClient httpclient = HttpClients.createDefault();

	public HttpConnect() {
	}

	public void httpGet(String site, String charset) {

		HttpGet httpGet = new HttpGet(site);
		try {
			CloseableHttpResponse execute = httpclient.execute(httpGet);
			HttpEntity entity = execute.getEntity();
			InputStream content = entity.getContent();

			List<String> lines = IOUtils.readLines(content, charset);
			for (String line : lines) {
				System.out.println(line);
			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(site);
	}

}
