/* 1-) User adında base bir sınıf oluşturunuz.
    firstname,lastname,email,password alanlarına sahip olsun.

    Customer(Müşteri) adında bir sınıf oluşturunuz.
    phoneNumber,address alanlarına sahip olsun.

    Employee(Çalışan) adında bir sınıf oluşturunuz.
    department alanına sahip olsun.

    BaseClass adında bir sınıf oluşturunuz.
    id(generic olcak),createdDate,updatedDate,deletedDate alanlarına sahip olsun.

    Customer ve Employee sınıfı User sınıfını inheritance edebilmelidir.
    User sınıfı BaseClass sınıfından inheritance edilmelidir.

    Customer ve Employee için add,update,delete,getlist,getbyid operasyonlarını yazınız.

*/
import java.util.Date;

class BaseClass<T> {
    private T id;
    private Date createdDate;
    private Date updatedDate;
    private Date deletedDate;

    public BaseClass(T id) {
        this.id = id;
        this.createdDate = new Date();
        this.updatedDate = new Date();
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }
}
