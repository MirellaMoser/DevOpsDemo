package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.List;

public class PathListEntry<T> {

	private Key key;
	private String name;
	private String color;
	private String icon;
	private String url;
	private String page;
	private String type;
	private boolean active;
	private String tooltip;
	private List<String> details = new ArrayList<>();
	private float order;
	private Form form;

	public PathListEntry() {
		this.active = true;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(T key, String name) {
		this.key = new Key(key, name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setOrder(float order) {
		this.order = order;
	}

	public float getOrder() {
		return order;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	
	public String getForm() {
		if (form == null) {
			return null;
		}
		return form.form;
	}
	
	public void setForm(String form) {
		if (form == null) {
			this.form = null;
		} else {
			this.form = new Form();
			this.form.form = form;
		}
	}

	public class Key {

		public Key(T key, String name) {
			super();
			this.key = key;
			this.name = name;
		}

		private T key;
		private String name;

		public T getKey() {
			return key;
		}

		public String getName() {
			return name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			@SuppressWarnings("unchecked")
			Key other = (Key) obj;
			if (key == null) {
				if (other.key != null)
					return false;
			} else if (!key.equals(other.key))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

	}
	
	private class Form {
		private String form;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PathListEntry<?> other = (PathListEntry<?>) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

}
