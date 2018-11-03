package guru.springframework.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ItemForView {
	private String name;
	private String category;
	private String photo;
}