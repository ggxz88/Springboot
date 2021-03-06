package org.hdcd.mapper;

import java.util.List;

import org.hdcd.domain.Screen;
import org.hdcd.domain.Seat;

public interface ScreenMapper {
		
	public void create(Screen screen) throws Exception;
	
	public void createSeat(Seat seat) throws Exception;
	
	public Screen read(String city, String screenName) throws Exception;
	
	public void update(Screen screen) throws Exception;
	
	public void delete(String city, String screenName) throws Exception;
	
	public List<Screen> list() throws Exception;
	
}
