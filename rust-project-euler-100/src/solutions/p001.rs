use crate::{Runable, Solvable};

pub struct P001;
impl Solvable for P001 {
    fn problem_name(&self) -> &str { "p001" }
    fn solve(&self) -> i64 {
        (1..1000).filter(|i| i % 3 == 0 || i % 5 == 0).sum()
    }
}
impl Runable for P001 {}
