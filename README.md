### Experience on Interview
I had asked a lots of questions before starting coding part. My strategy is to find out the requirements before starting.
my questions was such as
* What will be higher grade?
* Can any student be null or not
* Can grade Object / or gradeValue be null or not
* I write down all of cases first. Then start to write code when interviewer ask me to write code
* I think requirements analysis must be needed before starting. 
### Question
* Q1: find the list of student whose grade is higher or equal to B. All grades are A, B, C, D, E, F. The sequence of all grades are A > B > C > D > E > F   
* Q2: find the list of Employees whose department is CSE , age is greater or equals to 28.0 and salary is less than or equals 40000
* Two questions have multiple variations and sometime told to find out distinct employees or students. Sometime told to find out first employee.
### Question
* Find all primes from a string such "/dfdf/242/dfd/53/fdkf/3/dfjdkfj/ 45/3/5/6"
### Full Questions

```java
There a list of students whose contain their own grade. You have to find out the higher or equal grade from that list

@AllArgsConstructor
@Setter
@Getter
public class Student{
  private String name;
  private Optional<Grede> grade;
}



@AllArgsConstructor
@Setter
@Getter
public class Grade{
  private String gradeValue;
}

// Find all students  whose are found higher or equal grade

// Grades are A, B, C, D, E, F

public List<String> getStudent(List<Student> students){
     
}
// Write Junit for above solution


// Code Review

@Service
@RequiredArgsConstructors
public class menuservic{
  private final MenuRepository menurepository;
  private final String activeServiceStatus = "1";
  ValidationService validationService = new DefaultValidationService();
  MenuMapper menumapper = new MenuMapper();
 
  @Transactional
  public List<MenuDto> get_all_menu(){
      List<MenuEntitry> m2 = new ArrayList<>();
   
      try{
       
        List<MenuEntity> m1 = menuRepository.findAll();
         
        for(MenuEntity m : m1){
          if(m.status == activeServiceStatus){
            validationSerivce.validate(m);
            if(m.type == "SPECIAL"){
               continue;
            }
            m2.add(munuMapper.toDto(m));
          }
        }
       
       
      }catch(Exception ex){
          return Collections.emptyList();    
      }
   
    return m2;
  }
}


/// Code Review
public class MenuService{
   public void save(Menu menu){
     saveMenu(menu);
   }
 
  @Transactional
  private void saveMenu(Menu menu){
   
  }
 
}


// Cove Review
public class TestConfiguration{
   
   @Bean
    public X(){
      return new X();
    }
}

```

### Practice Environment
Interviewer take interview using [Link](https://codeshare.io/X8RgvY)

### JDK coding Principal
Follow the oracle principal [Link](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)