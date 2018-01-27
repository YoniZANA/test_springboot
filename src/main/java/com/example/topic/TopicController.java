package com.example.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TopicController {
	
	@Autowired //Instance de Service
	private TopicService topicService;
	
	@RequestMapping(method=RequestMethod.GET, value = "/topics")
	@ResponseBody
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	@ResponseBody
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value = "/topics", method=RequestMethod.POST)
	@ResponseBody
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
}
