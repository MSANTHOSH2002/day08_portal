package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.bike;
import com.example.demo.respository.bikeRepo;

@Service
public class bikeService {
@Autowired
bikeRepo br;
public List<bike> addBikes(List<bike> b)
{
	return (List<bike>)br.saveAll(b);
}
public List<bike> showBikeOnYear(int year)
{
	return br.fetchYear(year);
}
public List<bike> showBikeOnYearAndName(int year,String bName)
{
	return br.fetchYearAndBike(year, bName);
}
public List<bike> showBikeOnName(String name)
{
	return br.fetchBikeName(name);
}
}
