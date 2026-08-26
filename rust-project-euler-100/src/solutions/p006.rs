use crate::Solvable;

pub struct P006;
impl Solvable for P006 {
    fn problem_name(&self) -> &str { "p006" }
    fn solve(&self) -> i64 {
        let last = 100i64;
        let sum: i64 = (1..=last).sum();
        let sum_of_squares: i64 = (1..=last).map(|i| i * i).sum();
        sum * sum - sum_of_squares
    }
}
