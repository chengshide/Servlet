package com.imooc.collection;
/**
 * ¿Î³ÌÀà
 * @author ÓÄ¾²Ø¼¹Â¼Å
 *
 */
public class Course {
	public String id;
	public String name;
	public Course(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public Course() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
