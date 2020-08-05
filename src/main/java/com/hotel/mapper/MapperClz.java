/**
 * 
 */
package com.hotel.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.booking.Booking;
import com.hotel.booking.BookingDTO;
import com.hotel.dto.BaseDTO;
import com.hotel.entity.BaseEntity;
import com.hotel.master.category.CategoryDTO;
import com.hotel.master.customer.Customer;
import com.hotel.master.customer.CustomerDTO;
import com.hotel.master.user.User;
import com.hotel.master.user.UserInfo;
import com.hotel.rooms.RoomsDTO;

/**
 * @author User
 * @param <R>
 *
 */

@Component
public class MapperClz<R> {

	@Autowired
	private ModelMapper modelMapper;

	@SuppressWarnings("unchecked")
	public <T> List<T> convertToDto(List<? extends BaseEntity> entity) {
		System.out.println(entity);
		List<T> list = new ArrayList<T>();
		for (BaseEntity e : entity) {
			if (e.getClass().getName().equals("com.hotel.master.category.Category")) {
				list.add((T) modelMapper.map(e, CategoryDTO.class));
			}

			if (e.getClass().getName().equals("com.hotel.rooms.Rooms")) {

				list.add((T) modelMapper.map(e, RoomsDTO.class));
			}

			if (e.getClass().getName().equals("com.hotel.booking.Booking")) {

				list.add((T) modelMapper.map(e, BookingDTO.class));
			}

			if (e.getClass().getName().equals("com.hotel.master.customer.Customer")) {

				list.add((T) modelMapper.map(e, BookingDTO.class));
			}
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public <T> Optional<BaseDTO> convertToDto(T entity) throws RuntimeException {
		Optional<?> t = null;
		entity = (T) ((Optional<?>) entity).get();
		if (entity.getClass().getName().equals("com.hotel.master.customer.Customer")) {
//				return (Optional<BaseDTO>) Optional.of(((T) modelMapper.map(entity, CustomerDTO.class)));
			t = Optional.of(((T) modelMapper.map(entity, CustomerDTO.class)));
		}
		return (Optional<BaseDTO>) t;
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> convertToEntity(List<? extends BaseDTO> dto) {
		System.out.println(dto);
		List<T> list = new ArrayList<T>();
		for (BaseDTO e : dto) {

		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public <T> T convertToEntity(BaseDTO dto) {
		System.out.println(dto);

		if (dto.getClass().getName().equals("com.hotel.booking.BookingDTO")) {
			return ((T) modelMapper.map(dto, Booking.class));
		}
		
		if (dto.getClass().getName().equals("com.hotel.master.customer.CustomerDTO")) {
			return ((T) modelMapper.map(dto, Customer.class));
		}
		return null;
	}

	public UserInfo convertToUserInfo(User user) {
		UserInfo userInfo = null;
		if (Optional.of(user).isPresent()) {
			userInfo = new UserInfo();
			userInfo.setId(user.getId());
			userInfo.setUsername(user.getName());
			userInfo.setPassword(user.getPassword());
			userInfo.setEmail("abc@gmail.com");
//			userInfo.setFirstName(user.getCustomer().getName());
			userInfo.setRoles(user.getRoles());
		}
		if (userInfo == null) {
			throw new RuntimeException("User not valid.!");
		} else {
			return userInfo;
		}
	}

	public List<UserInfo> convertToUserInfo(List<User> user) {
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		for (User u : user)
			if (Optional.of(user).isPresent()) {
				UserInfo userInfo = new UserInfo();
				userInfo.setId(u.getId());
				userInfo.setUsername(u.getName());
				userInfo.setEmail("abc@gmail.com");
//				userInfo.setFirstName(u.getCustomer().getName());
				userInfo.setPassword(u.getPassword());
				userInfo.setRoles(u.getRoles());
				userInfoList.add(userInfo);
			}
		if (userInfoList.size() == 0) {
			throw new RuntimeException("Users not found.!");
		} else {
			return userInfoList;
		}
	}

}
