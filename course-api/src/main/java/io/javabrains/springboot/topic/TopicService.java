package io.javabrains.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //steoriotype annotation
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "spring name", "spring description"),
			new Topic("java", "java name", "java desc"),
			new Topic("Rajeev", "zycus", "eprocurrement software")
			));
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	
	public void updateTopic(Topic topic, String id) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = new Topic();
			if(t.getId()== id) {
				topics.set(i, topic);
			}
		}
		
	}
	
} 

//topic service -- main service
