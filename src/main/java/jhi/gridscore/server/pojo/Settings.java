package jhi.gridscore.server.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
public class Settings
{
	private String plausibleDomain;
	private String plausibleApiHost;
	private Boolean plausibleHashMode;
}
