package com.lr.playground.remotingshootout.hessian_hazelcast_shootout_api;

import java.io.Serializable;
import java.util.*;

public class DataClass implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	public static final DataClass EMPTY = new DataClass("", "", "", "", "");
	
	private final String string1;
	private final String string2;
	private final String string3;
	private final String string4;
	private final String string5;
	
	private final List<DataClass> listChildren;
	private final Map<String, DataClass> mappedChildren;
	
	private int calculatedHashcode;
	
	public DataClass(String string1, String string2, String string3, String string4, String string5, List<DataClass> listChildren,
			Map<String, DataClass> mappedChildren)
	{
		super();
		this.string1 = string1 != null ? string1 : "";
		this.string2 = string2 != null ? string2 : "";
		this.string3 = string3 != null ? string3 : "";
		this.string4 = string4 != null ? string4 : "";
		this.string5 = string5 != null ? string5 : "";
		
		this.listChildren = new ArrayList<DataClass>(listChildren);
		this.mappedChildren = new HashMap<String, DataClass>(mappedChildren);
	}

	public DataClass(String string1, String string2, String string3, String string4, String string5)
	{
		this(string1, string2, string3, string4, string5, Collections.<DataClass>emptyList(), Collections.<String, DataClass>emptyMap());
	}

	public DataClass (DataClass toCopy) {
		this.string1 = toCopy.string1;
		this.string2 = toCopy.string2;
		this.string3 = toCopy.string3;
		this.string4 = toCopy.string4;
		this.string5 = toCopy.string5;
		this.listChildren = new ArrayList<DataClass>(toCopy.listChildren);
		this.mappedChildren = new HashMap<String, DataClass>(toCopy.mappedChildren);
		this.calculatedHashcode = toCopy.calculatedHashcode;
	}

	public int getCalculatedHashcode()
	{
		return calculatedHashcode;
	}

	public void setCalculatedHashcode(int calculatedHashcode)
	{
		this.calculatedHashcode = calculatedHashcode;
	}

	public String getString1()
	{
		return string1;
	}

	public String getString2()
	{
		return string2;
	}

	public String getString3()
	{
		return string3;
	}

	public String getString4()
	{
		return string4;
	}

	public String getString5()
	{
		return string5;
	}

	public List<DataClass> getListChildren()
	{
		return listChildren;
	}

	public Map<String, DataClass> getMappedChildren()
	{
		return mappedChildren;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listChildren == null) ? 0 : listChildren.hashCode());
		result = prime * result + ((mappedChildren == null) ? 0 : mappedChildren.hashCode());
		result = prime * result + ((string1 == null) ? 0 : string1.hashCode());
		result = prime * result + ((string2 == null) ? 0 : string2.hashCode());
		result = prime * result + ((string3 == null) ? 0 : string3.hashCode());
		result = prime * result + ((string4 == null) ? 0 : string4.hashCode());
		result = prime * result + ((string5 == null) ? 0 : string5.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataClass other = (DataClass) obj;
		if (listChildren == null)
		{
			if (other.listChildren != null)
				return false;
		}
		else if (!listChildren.equals(other.listChildren))
			return false;
		if (mappedChildren == null)
		{
			if (other.mappedChildren != null)
				return false;
		}
		else if (!mappedChildren.equals(other.mappedChildren))
			return false;
		if (string1 == null)
		{
			if (other.string1 != null)
				return false;
		}
		else if (!string1.equals(other.string1))
			return false;
		if (string2 == null)
		{
			if (other.string2 != null)
				return false;
		}
		else if (!string2.equals(other.string2))
			return false;
		if (string3 == null)
		{
			if (other.string3 != null)
				return false;
		}
		else if (!string3.equals(other.string3))
			return false;
		if (string4 == null)
		{
			if (other.string4 != null)
				return false;
		}
		else if (!string4.equals(other.string4))
			return false;
		if (string5 == null)
		{
			if (other.string5 != null)
				return false;
		}
		else if (!string5.equals(other.string5))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "DataClass [string1=" + string1 + ", string2=" + string2 + ", string3=" + string3 + ", string4=" + string4 + ", string5=" + string5
				+ ", listChildren=" + listChildren + ", mappedChildren=" + mappedChildren + ", calculatedHashcode=" + calculatedHashcode + "]";
	}
	
}
