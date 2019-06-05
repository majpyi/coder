package 集合;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Mr.M
 * @Date: 2019-04-28 21:25
 * @Description:
 **/
public class EnumDemo {
	public static void main(String[] args) {
//		System.out.println(EventType.COMMENT);
		System.out.println(new EventModel(EventType.LIKE).getType());
		System.out.println(EventType.LIKE.getValue());
	}
}

enum EventType {
	LIKE(0),
	COMMENT(1),
	LOGIN(2),
	MAIL(3);

	private int value;

	EventType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

class EventModel {
	private EventType type;
	private int actorId;
	private int entityType;   //  触发对象
	private int entityId;
	private int entityOwnerId;
	private Map<String, String> exts = new HashMap<String, String>();

	public String getExt(String key) {
		return exts.get(key);
	}

	public EventModel setExt(String key, String value) {
		exts.put(key, value);
		return this;
	}

	public EventModel(EventType type) {
		this.type = type;
	}

	public EventModel() {

	}

	public EventType getType() {
		return type;
	}

	public EventModel setType(EventType type) {
		this.type = type;
		return this;
	}

	public int getActorId() {
		return actorId;
	}

	public EventModel setActorId(int actorId) {
		this.actorId = actorId;
		return this;
	}

	public int getEntityType() {
		return entityType;
	}

	public EventModel setEntityType(int entityType) {
		this.entityType = entityType;
		return this;
	}

	public int getEntityId() {
		return entityId;
	}

	public EventModel setEntityId(int entityId) {
		this.entityId = entityId;
		return this;
	}

	public int getEntityOwnerId() {
		return entityOwnerId;
	}

	public EventModel setEntityOwnerId(int entityOwnerId) {
		this.entityOwnerId = entityOwnerId;
		return this;
	}

	public Map<String, String> getExts() {
		return exts;
	}

	public void setExts(Map<String, String> exts) {
		this.exts = exts;
	}
}