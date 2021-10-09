package fr.raksrinana.twitchminer.api.gql.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GQLResponse<T>{
	@JsonProperty("errors")
	@NotNull
	@Builder.Default
	private List<GQLError> errors = new LinkedList<>();
	@JsonProperty("extensions")
	@NotNull
	@Builder.Default
	private Map<String, Object> extensions = new HashMap<>();
	@JsonProperty("data")
	@Nullable
	private T data;
	@JsonProperty("error")
	@Nullable
	private String error;
	@JsonProperty("status")
	@Nullable
	private Integer status;
	@JsonProperty("message")
	@Nullable
	private String message;
}
