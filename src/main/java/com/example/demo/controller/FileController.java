package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Vendor;
import com.example.demo.service.VendorServiceImpl;

@RestController
public class FileController {

	@Autowired
	VendorServiceImpl vendorService;

	@PostMapping("/upload")
	public String uploadXcel(@RequestParam MultipartFile xcelfile) throws IOException, InvalidFormatException {
		List<Vendor> vendors = new ArrayList<>();
		System.out.println(xcelfile == null);
		XSSFWorkbook sheet = new XSSFWorkbook(xcelfile.getInputStream());
		XSSFSheet workSheet = sheet.getSheetAt(0);
		System.out.println(workSheet.toString());
		for (int i = 1; i < workSheet.getPhysicalNumberOfRows(); i++) {
			Vendor vnd = new Vendor();
			XSSFRow row = workSheet.getRow(i);
			vnd.setvId(Integer.parseInt(row.getCell(0).getRawValue()));
			vnd.setvName(row.getCell(1).getStringCellValue());
			vnd.setVtype(row.getCell(2).getStringCellValue());
			vendors.add(vnd);
		}
		System.out.println(vendors + " all vendors\n");
		System.out.println(vendorService.saveVendors(vendors));
		return "file uploaded";
	}

	@GetMapping(path = "/get-vendor/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Vendor getVendor(@PathVariable("id") int id) {
		return vendorService.getVendor(id);
	}

	@DeleteMapping(path = "/delete-vendor/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteVendor(@PathVariable int id) {
		return vendorService.delteVendor(id);
	}
	
	@GetMapping(path = "/get-v-name/{id}")
	public String  getvenderName(@PathVariable int id) {
		return vendorService.getVenderName(id);
	}
}
