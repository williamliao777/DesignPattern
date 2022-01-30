package behavioral.visitor.practice.solution;

public class FormatSegment extends Segment {
  @Override
  public void applyFilter(AudioFilter filter) {
    filter.apply(this);
  }
}
