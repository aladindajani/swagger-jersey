package com.opentext.ix.ea.demo.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;



@XmlRootElement(name = "DepartmentCollection")
public class DepartmentCollection 
{	
  private List<Department> listOfDepartments = new ArrayList<Department>();

  @XmlElement
  public List<Department> getListOfDepartments() 
  {
    return listOfDepartments;
  }
  
 }

