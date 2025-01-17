package ch.abbts.nds.swe.swdt.starter.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class EmployeeTest {
  @Test
  @DisplayName("Is too young")
  public void tooYoung() {
    Employee employee = new Employee(12);
    assertFalse(employee.isOfAge(22), "Too young returns false");
  }

  @Test
  @DisplayName("Old enough")
  public void oldEnough() {
    Employee employee = new Employee(24);
    assertTrue(employee.isOfAge(22), "Old enough returns true");
  }

  @Test
  @DisplayName("Of exact age")
  public void exactAge() {
    Employee employee = new Employee(24);
    assertTrue(employee.isOfAge(24), "Exact age must also return true");
  }
}
