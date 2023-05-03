import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore {
  private List<Item> items = new ArrayList<Item>();
  private List<Customer> customers = new ArrayList<Customer>();

  public void register(Customer customer) {
    customers.add(customer);
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(Item item) {
    for (Item i : items) {
      if (item.getId() == i.getId()) {
        items.remove(item);
        for (Customer customer : customers) {
          for (int j = 0; j < customer.getRentals().size(); j++) {
            if (customer.getRentals().get(j).getItem().equals(item)) {
              customer.getRentals().remove(j);
            }
          }
        }
      }
    }

  }

  public List<Item> getAvailableItems() {
    return items;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public void rentItem(Item item, Customer customer) {
    int id = Integer.parseInt(item.getId() + "" + customer.getId());
    Rental rent = new Rental(item, customer, id);
    customer.getRentals().add(rent);
  }

  public void returnItem(Rental rental) {
    for (Customer customer : customers) {
      for (int j = 0; j < customer.getRentals().size(); j++) {
        if (customer.getRentals().get(j).getId() == rental.getId()) {
          rental.setReturnDate(new Date());
          rental.getItem().setAvailable(true);
          customer.getRentals().remove(j);
        }
      }
    }

  }

  public Customer getCustomerById(int id) {
    for (Customer customer : customers) {
      if (customer.getId() == id) {
        return customer;
      }
    }
    return null;
  }

  public Item getItemById(int id) {
    for (Item item : items) {
      if (item.getId() == id) {
        return item;
      }
    }
    return null;
  }
}
