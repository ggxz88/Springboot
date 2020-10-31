package org.hdcd.mapper;

import java.util.List;

import org.hdcd.domain.Screen;


public interface ScreenMapper {
		
	public void create(Screen screen) throws Exception;
	
	public Screen read(Integer screenNo) throws Exception;
	
	public void update(Screen screen) throws Exception;
	
	public void delete(Integer screenNo) throws Exception;
	
	public List<Screen> list() throws Exception;
	
}