package org.whispersystems.textsecuregcm.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebsocketConfiguration {

  @JsonProperty
  private boolean enabled = true;

  public boolean isEnabled() {
    return enabled;
  }

}
