use crate::Solvable;

pub struct P002;
impl Solvable for P002 {
    fn problem_name(&self) -> &str { "p002" }
    fn solve(&self) -> i64 {
        let max = 4_000_000i64;
        let (mut prev, mut curr) = (1i64, 2i64);
        let mut sum = curr;
        while curr < max {
            let next = prev + curr;
            if next < max && next % 2 == 0 {
                sum += next;
            }
            prev = curr;
            curr = next;
        }
        sum
    }
}
