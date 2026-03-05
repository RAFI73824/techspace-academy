package com.techspace.course_service.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseResponse {

	private Long id;
	private String title;
	private String description;
	private String category;
	private Double price;
	private Boolean active;
}