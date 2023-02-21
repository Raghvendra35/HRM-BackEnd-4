package com.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.entities.FileStorage;
import com.employee.entities.ImageAndFile;

import jakarta.persistence.criteria.Path;

public interface FileStorageRepository extends JpaRepository<FileStorage, Long> 
{

	 
	 
	 //Get Single Id
	 @Query(value="Select file_id from file_storage  where employee_employee_id=?",nativeQuery = true)
	 int getFileId(int id);
	 
	 
	 //Get fileId and here we will pass two things first employeeId and type of Files like-> image or resume
	 @Query(value="Select file_id from file_storage  where employee_employee_id=? and type_of_files=?",nativeQuery = true)
	 public int getFiles(int emplId, String typeOfFiles);
}
