package caching;

public enum CachingPolicy {
  THROUGH("through"), AROUND("around"), BEHIND("behind");

  private String policy;

  private CachingPolicy(String policy) {
    this.policy = policy;
  }

  public String getPolicy() {
    return policy;
  }
}
